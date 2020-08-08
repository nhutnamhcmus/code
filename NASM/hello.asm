%include "io.inc"
extern _printf
extern _getch

section .data
    tb  db  "Hello world", 0
section .text
global CMAIN
CMAIN:
    ;write your code here
    ;xuat tb
    ;printf("Hello world");
    push    tb
    call    _printf
    add     esp, 4
    
    call    _getch
    xor     eax, eax
    ret