grammar impl;

start
    :   reset  EOF
    ;

reset
    :    oscillator*
    ;

oscillator
    :  input
    ;

oscillatorM
    : simulate
    ;

and
    : #AND
    ;

input
    :   eq='='?'1'  and OscillatorM=oscillatorM #ONE
    |   eq='='?'0'  and OscillatorM=oscillatorM #ZERO
    ;

update
    : #Circuit
    ;

simulate
    :
    ;



RESET : [0-1];
WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT : '//' ~('\n')* -> skip;
LONGCOMMENT : '/*' (~[*]+ | '*'~[/])* '*/' -> skip;

//ARROW : '->' '&&' -> skip;
//oscillatorfirst  :    e='1'? oscillatorm  #FOMone
//                 |    e='0'? oscillatorm  #FOMzero
//                 ;
//
//oscillator       :    e='1'? output #OMzero
//                 |    e='0'? output #OMone
//                 ;
//
//
//output      :   oscillatorm
//            |
//            ;
//
//oscillatorm : e='1' oscillator #LOL
//            | e='0' oscillator  #BYE
//            | '1' oscillator #NOOB
//            | '0' oscillator #SUCK
//
//            ;

//         .hardware helloworld
//         .inputs Reset
//         .outputs Oscillator
//         .latch Oscillator -> OscillatorM
//         .update
//         Oscillator = !OscillatorM && !Reset
//         .simulate
//         Reset=0000100


//ZERO: '0';
//ONE: '1';
//NULL: [0];
//EQ: '=';
//ARROW: '->';

//checker: eq='='? number
//        //eq='='? ZERO zero
//        //| eq='='? ONE one
//        ;
//number: zero | one;
//zero : '0' eq='='? checker latcher;
//one : '1' eq='='? checker latcher;
//
//latcher: latch eq='='? checker ;
//
//latch: '0';
//output: NUMBER;

//start   : expr EOF;
//
//expr    : comparing*;
//
//comparing: if_stat
//         | OTHER { System.err.println("This char is unknown: "+ $OTHER.text);}
//         ;
//
//if_stat: latch;
//
//
//latch : '.latch' left=IDENTIFIER '->' right=IDENTIFIER;
//
////NUMBER NUMBER NUMBER NUMBER NUMBER NUMBER;
//OTHER: . ;
//IF : 'if';
//ELSE : 'else';
//OBRACE : '{';
//CBRACE : '}';
//
//IDENTIFIER: [0] ;
//
//NUMBER: [0-1];
//
//WHITESPACE : [ \n\t\r]+ -> skip;
//COMMENT : '//' ~('\n')* -> skip;
//LONGCOMMENT : '/*' (~[*]+ | '*'~[/])* '*/' -> skip;

//reset  EOF #Input;  //resets+=input*  EOF;

//reset   : circuit+  EOF
//        ;
//
//circuit : oscillator
//        ;
//
//oscillator  : e=expr  oscillatorM
//
//            //| eq='0'? oscillatorM
//            //| OscillatorM oscillatorM
//            ;
//oscillatorM : '.latch'    update
//
//            ;
//
//update      :  circuit;
//
//expr        : e1='1'          # VariableONE
//            | e0='0'          # VariableZERO
//            ;
//
//output: VariableZERO | VariableONE;
//

//latch : '.latch' left=NUMBER '->' right=NUMBER;

//expr    :   ZERO e1='0'? and #ONEFIRST
//        |   ZERO e1='1'? and #ZEROFIRST
//        |   OscillatorM='1' latch='0' and #ZERO
//        |   OscillatorM='0' latch='1' and #ZERO
//        |   OscillatorM='1' latch='1' and #ONE
//        |   OscillatorM='0' latch='0' and #ONE
//        | NUMBER       #FEJL
//        | EOF          #EOF
//        ;
//and: reset;


//         e1=expr '&&' e2=expr  # AND
//        |   e1=expr '!' e2=expr   # NOT
//        |   e1=expr '||' e2=expr  # OR
//        |   '(' e=expr ')'        # Parenthesis
                //|   NUMBER         # CONSTANT
//        |   expr '==' expr # COMPARISON
//        | 'if' expr 'then' expr
//        	            'else' expr # CONDITIONAL

//OscillatorM: [0-1];


//ZERO: '0';
//ONE: '1';
//AND: '&&';
//OUTPUT: ('0'..'1');2