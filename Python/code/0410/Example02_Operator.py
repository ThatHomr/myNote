# 세 자리 정수를 입력을 받아서
# 각 자리의 정수를 출력하는 프로그램을 작성.

# 입력
num = int(input('Enter a three digit integer >>> '))

# 312
hundred = num // 100
ten = (num % 100) // 10
one = num % 10
#----------------------------
hundred = (num // 100) % 10
ten = (num // 10) % 10
one = (num // 1) % 10
#----------------------------
one = num % 10
num //= 10
ten = num % 10
num //= 10
hundred = num % 10











