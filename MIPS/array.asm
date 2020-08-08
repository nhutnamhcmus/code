.data
	tb1: .asciiz "Nhap n: "
	tb2: .asciiz "a["
	tb3: .asciiz "]: "
	tb4: .asciiz "\nMang vua nhap la: "
	tb5: .asciiz "\nTong mang: "
	tb6: .asciiz "\nMax: "
	tb7: .asciiz "\nCac so nguyen to: "
	tb8: .asciiz "\nMang da sap xep la: "
	n: .word 0
	arr: .space 1024 # 256 phan tu
	
.text
	#truyen tham so
	la $a0,n
	la $a1,arr
	# Goi ham nhapmang
	jal _NhapMang

	#xuat tb4
	li $v0,4
	la $a0,tb4
	syscall
	
	#truyen tham so
	lw $a0,n
	la $a1,arr
	# Goi ham xuatmang
	jal _XuatMang

	#xuat tb5
	li $v0,4
	la $a0,tb5
	syscall
	#truyen tham so
	lw $a0,n
	la $a1,arr
	# Goi ham xuatmang
	jal _array.Sum
	
	#xuat tb6
	li $v0,4
	la $a0,tb6
	syscall
	#truyen tham so
	lw $a0,n
	la $a1,arr
	# Goi ham xuatmang
	jal _array.Max	
	
	#xuat tb7
	li $v0,4
	la $a0,tb7
	syscall
	#truyen tham so
	lw $a0,n
	la $a1,arr
	# Goi ham xuatmang
	jal _array.filter.Prime	
	
	#truyen tham so
	la $t0,arr
	lw $t1,n
	jal _array.Sort
	
	#xuat tb7
	li $v0,4
	la $a0,tb8
	syscall
	
	#truyen tham so
	lw $a0,n
	la $a1,arr
	# Goi ham xuatmang
	jal _XuatMang
	
	#ket thuc
	li $v0,10
	syscall
	

	
#========== Ham Nhap Mang =============
#dau thu tuc
_NhapMang:
	addi $sp,$sp,-32
	sw $ra,($sp)
	sw $s0,4($sp)
	sw $s1,8($sp)
	sw $t0,12($sp)
	sw $t1,16($sp)
	

	#Lay tham so luu vao thanh ghi
	move $s0,$a0
	move $s1,$a1

#than thu tuc
	#xuat tb1
	li $v0,4
	la $a0,tb1
	syscall

	#nhap so nguyen
	li $v0,5
	syscall

	#Luu vao n tai $s0
	sw $v0,($s0)
	
	#load gia tri n
	lw $s0,($s0)

	#Khoi tao vong lap
	li $t0,0 # i = 0
_NhapMang.Lap:
	#xuat tb2
	li $v0,4
	la $a0,tb2
	syscall

	#xuat i
	li $v0,1
	move $a0,$t0
	syscall

	#xuat tb3
	li $v0,4
	la $a0,tb3
	syscall

	#nhap so nguyen
	li $v0,5
	syscall

	#Luu vao a[i]  tai $s1
	sw $v0,($s1)
	
	#Tang dia chi 
	addi $s1,$s1,4
	
	#tang chi so i
	addi $t0,$t0,1
	
	#Kiem tra i < n thi Lap
	blt $t0,$s0,_NhapMang.Lap
#Cuoi thu tuc
	#resotore
	lw $ra,($sp)
	lw $s0,4($sp)
	lw $s1,8($sp)
	lw $t0,12($sp)
	lw $t1,16($sp)
	
	#xoa stack
	addi $sp,$sp,32
	# tra ve
	jr $ra



# ========== Xuat Mang ===========
_XuatMang:
	addi 	$sp,$sp,-32
	sw 	$ra,($sp)
	sw 	$s0,4($sp)
	sw 	$s1,8($sp)
	sw 	$t0,12($sp)
	sw 	$t1,16($sp)
	
	#Lay tham so luu vao thanh ghi
	move	$s0,$a0 #n
	move 	$s1,$a1 #arr

#Than thu tuc
	#khoi tao vong lap
	li 	$t0,0 # i = 0
_XuatMang.Lap:
	#xuat a[i]
	li 	$v0,1
	lw 	$a0,($s1)
	syscall

	#xuat khoang trang
	li 	$v0,11
	li 	$a0,' '
	syscall

	#Tang dia chi mang
	addi 	$s1,$s1,4
	#Tang i
	addi 	$t0,$t0,1
	
	#Kiem tra i < n thi Lap
	blt 	$t0,$s0,_XuatMang.Lap
#Cuoi thu tuc		
	#resotore
	lw $ra,($sp)
	lw $s0,4($sp)
	lw $s1,8($sp)
	lw $t0,12($sp)
	lw $t1,16($sp)
	
	#xoa stack
	addi $sp,$sp,32
	
	# tra ve
	jr $ra

	
# ========== Tinh tong mang ===========
_array.Sum:
	addi 	$sp, $sp,-32
	sw 	$ra, ($sp)
	sw 	$s0, 4($sp)
	sw 	$s1, 8($sp)
	sw 	$t0, 12($sp)
	sw 	$t1, 16($sp)
	sw	$t2, 24($sp)
#Lay tham so luu vao thanh ghi
	move 	$s0,$a0 		# n
	move 	$s1,$a1 		# arr

#Than thu tuc
	#khoi tao vong lap
	li 	$t0, 0 			# i = 0
	add 	$t1, $zero, $zero 	# sum = 0
_array.Sum.Loop:
	lw 	$a0,($s1)
	addu	$t1, $t1, $a0
	#Tang dia chi mang
	addi 	$s1,$s1,4
	#Tang i
	addi 	$t0,$t0,1
	
	#Kiem tra i < n thi Lap
	blt 	$t0,$s0,_array.Sum.Loop
	
	add $a0, $zero, $t1
	add $v0, $zero, 1
	syscall
#Cuoi thu tuc	
	#resotore
	lw $ra,($sp)
	lw $s0,4($sp)
	lw $s1,8($sp)
	lw $t0,12($sp)
	lw $t1,16($sp)
	
	#xoa stack
	addi $sp,$sp,32
	
	# tra ve
	jr $ra
	
# ========== Tim max cua mang ===========
_array.Max:
	addi 	$sp,$sp,-32
	sw 	$ra,($sp)
	sw 	$s0,4($sp)
	sw 	$s1,8($sp)
	sw 	$t0,12($sp)
	sw 	$t1,16($sp)
	sw 	$t2,20($sp)
	
#Lay tham so luu vao thanh ghi
	move 	$s0,$a0 		# n
	move 	$s1,$a1 		# arr
	#Than thu tuc
#khoi tao vong lap
	li 	$t0, 0 			# i = 0
	lw 	$a0,($s1)
	add	$t1, $t1, $a0		# max = a[0]
_array.Max.Loop:
	lw 	$a0,($s1)
	add	$t2, $zero, $a0
	
	slt 	$t3, $t1, $t2
	beq	$t3, 1, _array.Max.setMax
	beq 	$t3, 0, _array.Max.next
_array.Max.setMax:
	add	$t1, $zero, $t2
_array.Max.next:
	#Tang dia chi mang
	addi 	$s1,$s1,4
	#Tang i
	addi 	$t0,$t0,1
	
	#Kiem tra i < n thi Lap
	blt 	$t0,$s0,_array.Max.Loop
	
	add 	$a0, $zero, $t1
	add 	$v0, $zero, 1
	syscall
#Cuoi thu tuc	
	#resotore
	lw 	$ra,($sp)
	lw 	$s0,4($sp)
	lw 	$s1,8($sp)
	lw 	$t0,12($sp)
	lw 	$t1,16($sp)
	lw 	$t2,20($sp)
	#xoa stack
	addi 	$sp,$sp,32
	# tra ve
	jr 	$ra

# === Check prime
_isPrime:
	addi 	$sp,$sp,-32
	sw 	$ra,($sp)
	sw 	$s0,4($sp)
	sw 	$s1,8($sp)
	sw 	$t0,12($sp)
	sw 	$t1,16($sp)
	sw 	$t2,20($sp)
	
#Lay tham so luu vao thanh ghi
	move 	$s0, $a2	# number
	add	$t1, $zero, 2	# i = 2
	beq 	$s0, 1, _isPrime.ReturnFalse
	beq	$s0, 2, _isPrime.ReturnTrue
_isPrime.Loop:
	divu 	$s0, $t1
	mfhi 	$t2
	
	beq  	$t2, 0, _isPrime.ReturnFalse
	
	addi 	$t1,$t1, 1
	slt  	$t0, $t1, $s0
	beq  	$t0, 0, _isPrime.ReturnTrue
	j 	_isPrime.Loop
_isPrime.ReturnFalse:
	add $v0, $zero, 0
	j _isPrime.endIsPrime
_isPrime.ReturnTrue:
	add $v0, $zero, 1
	j _isPrime.endIsPrime
_isPrime.endIsPrime:
	#Cuoi thu tuc	
	#resotore
	lw 	$ra,($sp)
	lw 	$s0,4($sp)
	lw 	$s1,8($sp)
	lw 	$t0,12($sp)
	lw 	$t1,16($sp)
	lw 	$t2,20($sp)
	#xoa stack
	addi 	$sp,$sp,32
	# tra ve
	jr 	$ra	
# ==== Liet ke so nguyen to
_array.filter.Prime:
	addi 	$sp,$sp,-32
	sw 	$ra,($sp)
	sw 	$s0,4($sp)
	sw 	$s1,8($sp)
	sw 	$t0,12($sp)
	sw 	$t1,16($sp)
	sw 	$t2,20($sp)
	
#Lay tham so luu vao thanh ghi
	move 	$s0,$a0 		# n
	move 	$s1,$a1 		# arr
	#Than thu tuc
#khoi tao vong lap
	li 	$t0, 0 			# i = 0
	lw 	$a0,($s1)
	add	$t1, $t1, $a0		# max = a[0]
_array.filter.Prime.Loop:
	lw 	$a2,($s1)
	jal	_isPrime
	
	beq 	$v0, 1, _array.filter.Prime.printElement
	j _array.filter.Prime.next
_array.filter.Prime.printElement:
	li	$v0, 1
	lw 	$a0,($s1)
	syscall
	
	#xuat khoang trang
	li 	$v0,11
	li 	$a0,' '
	syscall	
_array.filter.Prime.next:
	#Tang dia chi mang
	addi 	$s1,$s1,4
	#Tang i
	addi 	$t0,$t0,1
	
	#Kiem tra i < n thi Lap
	blt 	$t0,$s0,_array.filter.Prime.Loop	
#Cuoi thu tuc	
	#resotore
	lw 	$ra,($sp)
	lw 	$s0,4($sp)
	lw 	$s1,8($sp)
	lw 	$t0,12($sp)
	lw 	$t1,16($sp)
	lw 	$t2,20($sp)
	#xoa stack
	addi 	$sp,$sp,32
	# tra ve
	jr 	$ra	
# === Sap xep mang =====

_array.Sort:
    addiu   $sp, $sp, -4
    sw      $ra, 0($sp)          
    sll     $t1, $t1, 2          
    li      $v0, 0               
 _array.Sort.Loop:
    slt     $t3, $v0, $t1       
    beq     $t3, $zero,  _array.Sort.End    
    bne     $v0, $zero,  _array.Sort.Compare 
    addiu   $v0, $v0, 4         
 _array.Sort.Compare:
    addu    $t2, $t0, $v0      
    lw      $t4, -4($t2)         
    lw      $t5, 0($t2)         
    blt     $t5, $t4, _array.Sort.Swap   
    addiu   $v0, $v0, 4        
    j        _array.Sort.Loop
 _array.Sort.Swap:
    sw      $t4, 0($t2)       
    sw      $t5, -4($t2)
    addiu   $v0, $v0, -4       
    j       _array.Sort.Loop
 _array.Sort.End:
   srl     $t1, $t1, 2
   lw      $ra, ($sp)          
   addi    $sp, $sp, 4          
   jr      $ra   
	
	
	
	
	


	
