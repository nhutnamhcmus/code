# @created by Le Nhut Nam
# @ vn.hcmus.fit.sv18120061.computerarchitecture.mips
# Nhap vao mot ky tu, xuat ra ky tu lien truoc va lien sau
.data
	tb1: .asciiz "Nhap mot ky tu: "
	tb2: .asciiz "\nKy tu lien truoc: "
	tb3: .asciiz "\nKy tu lien sau: "
.text
	# Xuat tb1
	li $v0, 4 
	la $a0, tb1
	syscall
	# Nhap ky tu
	addi $v0, $zero, 12
	syscall
	move $t0, $v0 # $t0 chua ky tu
	# Xuat tb2
	li $v0, 4 
	la $a0, tb2
	syscall
	addi $t1, $t0, 1
	add $a0, $zero, $t1
        addi $v0, $zero, 11
        syscall
        # Xuat tb2
	li $v0, 4 
	la $a0, tb3
	syscall
	addi $t2, $t0, -1
	add $a0, $zero, $t2
        addi $v0, $zero, 11
        syscall
         # Thoat
        addi $v0, $zero, 10
        syscall
