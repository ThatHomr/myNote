# Example03_IF.py

# 정수 하나를 입력을 받고
# 짝수인지 홀수인지 조건문을 이용하여 출력

n = int(input('Enter an integer >>> '))

# 만약 n 이 2 로 나눴을 때 나머지가 0 이면 짝수
# 그렇지 않으면 홀수
if n % 2 == 0 :
    res = "even"
else :
    res = "odd"

print(f'n is {res} number.')