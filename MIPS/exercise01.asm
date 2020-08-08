# @created by Le Nhut Nam
# @ vn.hcmus.fit.sv18120061.computerarchitecture.mips
# Nhap vao mot chuoi, xuat lai chuoi do ra man hinh (echo)
.data
	msg1: .asciiz "Nhap mot chuoi: "
	msg2: .asciiz "Chuoi da nhap: "
	str: .space 30
.text
	.globl main
main:
	# Xuat thong bao 1
	li $v0, 4
	la $a0, msg1
	syscall
	
	# Nhap chuoi
	li $v0, 8
	la $a0, str
	li $a1, 30
	syscall
	
	# xuat thong bao 2
	li $v0, 4
	la $a0, msg2
	syscall
	
	# Xuat chuoi
	li $v0, 4
	la $a0, str
	syscall
	
	# Exit
	li $v0, 10
	syscall
