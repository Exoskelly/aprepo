########################################################################
# Description:
# Input two numbers and display their sum and difference
#
# Arguments:
#
# Returns:
########################################################################
.data
prompt1: .asciiz "Enter First Num: "
prompt2: .asciiz "Enter Second Num: "
out1: 	      .asciiz "Sum: "
out2:       .asciiz "\nDifference: "

.text
main:
	la $a0, prompt1
	li $v0, 4
	syscall
	li $v0, 5
	syscall
	move $t0, $v0
	la $a0, prompt2
	li $v0, 4
	syscall
	li $v0, 5
	syscall
	move $t1, $v0
	add $s0, $t0, $t1
	sub $s1, $t0, $t1
	la $a0, out1
	li $v0, 4
	syscall
	move $a0, $s0
	li $v0, 1
	syscall
	la $a0, out2
	li $v0, 4
	syscall
	move $a0, $t1
	li $v0, 1
	syscall
exit:
	li $v0, 10
	syscall
