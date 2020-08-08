# @created by Le Nhut Nam
# @vn.hcmus.fit.sv18120061.computerarchitecture.mips
# Nhap mot ky tu tu ban phim. Neu ky tu vua nhap thuoc [0-9], [a-z], [A-Z] thi xuat ra man hinh ky tu do va loai cua ky tu do (so, chu thuong, chu hoa)
.data
	tb1: .asciiz "Nhap vao mot ky tu: "
	tb2: .asciiz " la so"
	tb3: .asciiz " la chu thuong"
	tb4: .asciiz " la chu hoa"
	tb5: .asciiz "\nKy tu vua nhap la: "
	tb6: .asciiz " la loai khac"
.text
	# Xuat tb1
	li $v0, 4 
	la $a0, tb1
	syscall
	# Nhap ky tu
	addi $v0, $zero, 12
	syscall
	move $t0, $v0 # $t0 chua ky tu
	slti $t1,$t0, 48
	beq $t1, 1, LoaiKhac
	slti $t1,$t0, 58
	beq $t1, 1, kyTuSo
	slti $t1,$t0, 65
	beq $t1, 1, LoaiKhac
	slti $t1,$t0, 91
	beq $t1, 1, kyTuChuHoa
	slti $t1,$t0, 97
	beq $t1, 1, LoaiKhac
	slti $t1,$t0, 123
	beq $t1, 1, kyTuChuThuong
LoaiKhac:
	# Xuat tb5
	li $v0, 4 
	la $a0, tb5
	syscall
	add $a0, $zero, $t0
        addi $v0, $zero, 11
        syscall
        # Xuat tb6
	li $v0, 4 
	la $a0, tb6
	syscall
	j Exit
kyTuSo:
	# Xuat tb5
	li $v0, 4 
	la $a0, tb5
	syscall
	add $a0, $zero, $t0
        addi $v0, $zero, 11
        syscall
        j Exit
        # Xuat tb2
	li $v0, 4 
	la $a0, tb2
	syscall
	j Exit
kyTuChuThuong:
	# Xuat tb5
	li $v0, 4 
	la $a0, tb5
	syscall
	add $a0, $zero, $t0
        addi $v0, $zero, 11
        syscall
        # Xuat tb3
	li $v0, 4 
	la $a0, tb3
	syscall
	j Exit
kyTuChuHoa:
	# Xuat tb5
	li $v0, 4 
	la $a0, tb5
	syscall
	add $a0, $zero, $t0
        addi $v0, $zero, 11
        syscall
        # Xuat tb4
	li $v0, 4 
	la $a0, tb4
	syscall
	j Exit
Exit:
	addi $v0, $zero, 10
        syscall

