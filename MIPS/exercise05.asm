# @created by Le Nhut Nam
# @ vn.hcmus.fit.sv18120061.computerarchitecture.mips
# Nhap vao 2 so nguyen, xuat ra phep so sanh giua 2 so

.data
	tb1: .asciiz "Nhap so thu nhat: "
	tb2: .asciiz "Nhap so thu hai: "
	tb3: .asciiz "So lon hon la: "
.text
	# Xuat tb1
	li $v0, 4
	la $a0, tb1
	syscall
	# Nhap vao a
	addi $v0, $zero, 5
	syscall
	add $t0, $zero, $v0
	# Xuat tb2
	li $v0, 4
	la $a0, tb2
	syscall
	# Nhap vao b
	addi $v0, $zero, 5
	syscall
	add $t1, $zero, $v0
	# $t2 se la bien tam luu gia tri lon nhat
	add $t2, $zero, $t0
	# So sanh
	slt $t3, $t0, $t1 # $t3 = ($t0 < $t1)
	beq $t3, $zero, printLarger # Neu $t3 = 0 -> Xuat
	add $t2, $zero $t1
printLarger:
	# Xuat tb3
	li $v0, 4
	la $a0, tb3
	syscall
	addi $v0, $zero, 1
	add $a0, $zero, $t2
	syscall
exit: 
	addi $v0, $zero, 10	# syscall 10: exit
	syscall
