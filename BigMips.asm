########################################################################
# Description:
# Compute (1000 - 200 + 30), multiply by 2, and display the result
#
# Arguments:
#
# Returns:
########################################################################
.data
.text
main:
	li $a0, 1000
	li $a1, 200
	li $a2, 30
	sub $a0, $a0, $a1
	add $a0, $a0, $a2
	li $v0, 1
	syscall
exit:
	li $v0, 10
	syscall