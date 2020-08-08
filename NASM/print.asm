; Yeu cau: Nhap vao ho ten, xuat xin chao + hoten
%include "io.inc"

extern _printf
extern _scanf
extern _getch
extern _gets

section .data
    tb1 db "Nhap ho ten: ", 0
    tb2  db "Xin chao %s", 0
    fmt db "%s", 0
section .bss
    hoten resb 30
section .text
global CMAIN
CMAIN:
    ;write your code here
    ; xuat tb1
    push tb1
    call _printf
    add esp, 4
    ; nhap hoten
    ; scanf("%s", &hoten);
    push hoten
    call _gets
    add esp, 4
    
    ; xuat tb2
    ; printf("Xin chao %s", hoten)
    push hoten
    push tb2
    call _printf
    
    call _getch
    xor eax, eax
    ret