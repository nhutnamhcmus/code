# @created by Le Nhut Nam
# @ vn.hcmus.fit.sv18120061.computerarchitecture.mips
# Nhap vao mot ky tu in hoa, in ra ky tu thuong
.data
	msg1: .asciiz "Nhap mot ky tu: "
	msg2: .asciiz "\nKy tu thuong: "
.text
	.globl main
main:
	# Xuat tb1
	li $v0, 4 
	la $a0, msg1
	syscall
	# Nhap ky tu
	addi $v0, $zero, 12
	syscall
	move $t0, $v0 # $t0 chua ky tu
	# Xuat tb2
	li $v0, 4 
	la $a0, msg2
	syscall
	addi $t1, $t0, 32
	add $a0, $zero, $t1
        addi $v0, $zero, 11
        syscall
        # exit
        addi $v0, $zero, 10
        syscall

	
