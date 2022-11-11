# Example04_IF.py

# 정수 a, b 를 입력을 받고
# a 가 3의 배수이고 b 가 5의 배수이면 'Wonderful Day!' 를 출력
# 그렇지 않으면 'Beautiful Day!' 를 출력

a = int(input('Enter the first integer >>> '))
b = int(input('Enter the second integer >>> '))

# 논리 연산자 → and, or, not
if (a % 3 == 0) and (b % 5 == 0) :
    res = 'Wonderful Day'
else :
    res = 'Beautiful Day'

print(f'>>> {res}')