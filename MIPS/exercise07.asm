# @created by Le Nhut Nam
# @vn.hcmus.fit.sv18120061.computerarchitecture.mips
# Nhap mon mang cac so nguyen n phan tu, xuat mang do ra man hinh
.data
        tb1: .asciiz "Nhap so luong phan tu: "
        tb2: .asciiz "Nhap mang cac so nguyen: "
        tb3: .asciiz "Mang so nguyen la: "
array:
        .space 1024
.text
	# xuat tb1
	li	$v0, 4
	la	$a0, tb1
	syscall
	
	# Nhap so luong phan tu mang
        addi 	$v0, $zero, 5     
        syscall
        add 	$t0, $zero, $v0    # $t0 luu so luong phan tu mang
        sll 	$t0, $t0, 2         

	# Kiem tra xem so luong phan tu mang co lon hon 1024 hay khong?
        slti 	$t3, $t0, 1024
        beq 	$t3, $zero, thoat
	
	# Xuat tb2
	li	$v0, 4
	la	$a0, tb2
	syscall
	
        la 	$t1, array
        add 	$t2, $t1, $t0
nhapMang:
        slt 	$t3, $t1, $t2      # $t3 = iterator < arr + len
        beq 	$t3, $zero, thoatNhap

	# Nhap phan tu array[i]
        addi 	$v0, $zero, 5
        syscall
        sb 	$v0, 0($t1)

        addi 	$t1, $t1, 4      # iterator += 4
        j 	nhapMang
thoatNhap:
        la 	$t1, array
        add 	$t2, $t1, $t0
        
        # Xuat tb3
        li	$v0, 4
	la	$a0, tb3
	syscall
xuatMang:
        slt 	$t3, $t1, $t2      # $t3 = iterator < arr + len
        beq 	$t3, $zero, thoatXuat

	# Load phan tu array[i] luu vao $a0
        addi 	$v0, $zero, 1    
        lb 	$a0, 0($t1)          
        syscall

	# Xuat phan tu array[i]
        addi 	$v0, $zero, 11    
        addi 	$a0, $zero, 32    # 32 = space
        syscall

        addi 	$t1, $t1, 4        # iterator += 4
        j 	xuatMang
thoatXuat:

thoat:
        addi $v0, $zero, 10
        syscall
