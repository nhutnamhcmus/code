# @created by Le Nhut Nam
# @ vn.hcmus.fit.sv18120061.computerarchitecture.mips
# Nhap mo so nguyen n, tinh tong tu 1 den n
.data
	tb1: .asciiz "Nhap vao mot so: "
	tb2: .asciiz "Tong tu 1 den "
	tb3: .asciiz " la: "
.text
	# Xuat tb1
	li $v0, 4
	la $a0, tb1
	syscall
	addi $v0, $zero, 5
	syscall
	# Luu v0 vao s0
	add $s0, $zero, $v0
	
	addi $t0, $zero, 0	# Tong
	addi $t1, $zero, 1	# Dem
	addi $t2, $s0, 1
Loop:
	slt $t3, $t1, $t2
	beq $t3, $zero, Exit
	add $t0, $t0, $t1
	addi $t1, $t1, 1
	j Loop
Exit:
	# Xuat tb1
	li $v0, 4
	la $a0, tb2
	syscall
	add $a0, $zero, $s0
	add $v0, $zero, 1
	syscall
	# Xuat tb1
	li $v0, 4
	la $a0, tb3
	syscall
	add $a0, $zero, $t0
	add $v0, $zero, 1
	syscall
	addi $v0, $zero, 10
	syscall
	
