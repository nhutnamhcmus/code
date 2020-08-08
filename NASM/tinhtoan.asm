; Yeu cau: Nhaop vao 2 so a, b. Tinh tong, hieu, tich, thuong a, b
%include "io.inc"
extern _printf
extern _scanf
extern _getch
section .data
    tb1 db "Nhap a: ", 0
    tb2 db "Nhap b: ", 0
    tb3 db 10,"%d %c %d = %d", 0;
    tb4 db " du la: %d", 0
    fmt db "%d", 0
section .bss
    a resd 1
    b resd 1
    c resd 1
    d resd 1
section .text
global CMAIN
CMAIN:
    ;write your code here
    ; xuat tb1
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
    
    
    call _getch
    xor eax, eax
    ret