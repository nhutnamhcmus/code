# @created by Le Nhut Nam
# @ vn.hcmus.fit.sv18120061.computerarchitecture.mips
# Nhap vao mot chuoi, xuat ra chuoi dao nguoc
.data
	msg1: .asciiz "Nhap vao mot chuoi: "
	msg2: .asciiz "Chuoi nguoc la: "
	str: .space 256
	newLine: .asciiz "\n"
.text
	# Xuat msg1
	li $v0, 4
	la $a0, msg1
	syscall
	# Nhap chuoi
	li $v0, 8
	la $a0, str
	li $a1, 256
	syscall
	
	add $t0, $a0, $zero
	lb $t5, newLine
	
	
find_end:
	lb $t1, ($t0)
	addi $t0, $t0, 1
	beq $t5, $t1, end
	bne $t1, $zero, find_end
end:
	addi $t0, $t0, -2

swap:
	lb $t2, ($a0) 
	lb $t3, ($t0)
	sb $t2, ($t0)
	sb $t3, ($a0)
	addi $a0, $a0, 1
	addi $t0, $t0, -1
	ble $a0, $t0, swap
	
	li $v0, 4
	la $a0, str
	syscall
	
	li $v0, 10
	syscall
