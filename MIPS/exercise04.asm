# @created by Le Nhut Nam
# @ vn.hcmus.fit.sv18120061.computerarchitecture.mips
# Nhap tu ban phim 2 so nguyen, tinh tong, hieu, tich, thuong cua 2 so
.data
	tb1: .asciiz "Nhap a: "
	tb2: .asciiz "Nhap b: "
	tb3: .asciiz "Tong la: "
	tb4: .asciiz "Hieu la: "
	tb5: .asciiz "Tich la: "
	tb6: .asciiz "Thuong la: "
	tb7: .asciiz " du "
	tb8: .asciiz "Chuc nang khong ton tai!"
	menu: .asciiz "===== Menu =====\n1. Tong\n2. Hieu\n3. Tich\n4. Thuong\n5. Thoat \n========\nChon: "
	a: .word 0
	b: .word 0
	kq: .word 0
	du: .word 0
.text
	# Xuat tb1
	li $v0,4
	la $a0, tb1
	syscall
	# Nhap a
	li $v0, 5
	syscall
	# Luu $v0 vao a
	sw $v0, a
	# Xuat tb2
	li $v0,4
	la $a0, tb2
	syscall
	# Nhap a
	li $v0, 5
	syscall
	# Luu $v0 vao a
	sw $v0, b
	
	# Load a vao $s0
	lw $s0, a
	# Load b vao $s1
	lw $s1, b
	
	# Xuat menu
XuatMenu:
	li $v0,4
	la $a0, menu
	syscall
	# Nhap chon
	li $v0, 5
	syscall
	# luu chon vao $t0
	move $t0, $v0
	
	beq $t0, 1, Tong
	beq $t0, 2, Hieu
	beq $t0, 3, Tich
	beq $t0, 4, Thuong
	j NhapSai
Tong:
	# Tinh tong
	add $s2, $s0, $s1
	# Luu vao kq
	sw $s2, kq
	# Xuat tb3
	li $v0,4
	la $a0, tb3
	syscall
	j XuatKq
Hieu:
	# Tinh hieu
	sub $s2, $s0, $s1
	# Luu vao kq
	sw $s2, kq
	# Xuat tb4
	li $v0,4
	la $a0, tb4
	syscall
	j XuatKq
Tich:
	# Tinh tich
	mult $s0, $s1
	mflo $s2
	# Luu vao kq
	sw $s2, kq
	# Xuat tb5
	li $v0,4
	la $a0, tb5
	syscall
	j XuatKq
Thuong:
	# Tinh thuong
	div $s0, $s1
	mflo $s2 # s2 = lo
	mfhi $s3 # s3 = hi
	# Luu vao kq
	sw $s2, kq
	sw $s3,du
	# Xuat tb6
	li $v0,4
	la $a0, tb6
	syscall
	
	li $v0, 1
	lw $a0, kq
	syscall
	
	# Xuat tb7
	li $v0,4
	la $a0, tb7
	syscall
	
	li $v0, 1
	lw $a0, du
	syscall
	j Thoat
XuatKq:
	# Xuat kq
	li $v0, 1
	lw $a0, kq
	syscall
	j Thoat
NhapSai:
	# Xuat tb8
	li $v0,4
	la $a0, tb8
	syscall
	j XuatMenu
Thoat:
	li $v0, 10
	syscall
