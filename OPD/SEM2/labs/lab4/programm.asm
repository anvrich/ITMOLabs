ORG 0x2B3
START:
    CLA
    ST result
    LD z
    INC
    PUSH 
    CALL $func
    POP
    SUB result
    ST result
    LD x
    PUSH
    CALL $func
    POP
    SUB result
    ST result
    LD y
    PUSH 
    CALL $func 
    POP
    INC 
    ADD result
    ST result
    HLT 
    z: WORD 0x0
    y: WORD 0x0
    x: WORD 0x0
    result: WORD 0xF7CF ; = 0

ORG 0x6AD
func:
    LD &1 
    BPL L 
    SUB A 
    BMI L
    BEQ L
    ADD A
    ASL
    ASL
    SUB &1
    SUB B
    J : JUMP S
    L : LD A
    S : ST &1
    RET 
    A : WORD 0xF7CE
    B : WORD 0x0059
 
