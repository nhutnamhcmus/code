%include "io.inc"
extern _printf
extern _scanf
extern _getch
section .data
    menu db 10, "===== MENU =====", 10, "1. Tinh tong", 10, "2. Tinh hieu", 10, "3. Tinh tich", 10, "4. Tinh thuong", 10, "5. Thoat", 10, "Chon: ", 0
    tb1 db "Nhap a: ", 0
    tb2 db "Nhap b: ", 0
    tb3 db 10,"%d %c %d = %d", 0;
    tb4 db " du la: %d", 0
    errorMsg db 10, "Chuc nang khong ton tai.!", 0
    fmt db "%d", 0
section .bss
    a resd 1
    b resd 1
    c resd 1
    d resd 1
    choose resd 1
section .text
global CMAIN
CMAIN:
    ;write your code here  ; xuat tb1
    push tb1
    call _printf
    add esp, 4
    ; nhap a
    ; scanf("%d, &a);
    push a
    push fmt
    call _scanf
    add esp, 8
    
     ; xuat tb2
    push tb2
    call _printf
    add esp, 4
    ; nhap b
    ; scanf("%d, &b);
    push b
    push fmt
    call _scanf
    add esp, 8
 _menu:   
    push menu
    call _printf
    add esp, 4
    ; nhap chon
    push choose
    push fmt
    call _scanf
    add esp, 8
    
    cmp dword[choose], 1
    je sum
    cmp dword[choose], 2
    je subtract
    cmp dword[choose], 3
    je multiply
    cmp dword[choose], 4
    je division
    cmp dword[choose], 5
    je exit
    
    jmp error
 sum:  
    ; tinh tong
    mov eax, [a]
    add eax, [b] ; eax = eax + [b]
    mov [c], eax
    
    ; xuat tong
    ; printf("%d %c %d = %d\n", a, b, c);
    push dword[c]
    push dword[b]
    push '+'
    push dword[a]
    push tb3
    call _printf
    add esp, 17
    jmp _menu    
 subtract:   
    ; tinh hieu
    mov eax, [a]
    sub eax, [b] ; eax = eax - [b]
    mov [c], eax
    
    ; xuat hieu
    ; printf("%d %c %d = %d", a, b, c);
    push dword[c]
    push dword[b]
    push '-'
    push dword[a]
    push tb3
    call _printf
    add esp, 17
    jmp _menu  
 multiply:     
    ; tinh tich
    mov eax, [a]
    mul dword[b] ; eax = eax * [b]
    mov [c], eax
    
    ; xuat tich
    ; printf("%d %c %d = %d", a, b, c);
    push dword[c]
    push dword[b]
    push '*'
    push dword[a]
    push tb3
    call _printf
    add esp, 17
    jmp _menu  
division:   
    ; tinh thuong
    mov eax, [a]
    div dword[b] ; eax = eax / [b]
    mov [c], eax
    mov [d], edx
    
    ; xuat thuong
    ; printf("%d %c %d = %d", a, b, c);
    push dword[c]
    push dword[b]
    push '/'
    push dword[a]
    push tb3
    call _printf
    add esp, 17
    
    ; xuat tb4
    push dword[d]
    push tb4
    call _printf
    add esp, 8
    jmp _menu 
error:
    push errorMsg
    call _printf
    add esp, 4
    jmp _menu
exit:    
    call _getch
    xor eax, eax
    ret
