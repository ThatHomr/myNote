# Example02_Operator.py

# 2 개의 정수를 입력을 받아서
# 큰 값과 작은 값을 각각 출력

# 첫번째 정수
a = int(input('Enter the first integer >>> '))
# 두번째 정수
b = int(input('Enter the second integer >>> '))

# a 가 b 보다 더 큰 경우
#  큰 값 : a, 작은 값 : b
# b 가 a 보다 더 큰 경우
#  큰 값 : b, 작은 값 : a

# maximum = a if a > b else b
# minimum = a if a < b else b

maximum, minimum = (a, b) if a > b else (b, a)


print(f'maximum = {maximum}')
print(f'minimum = {minimum}')
