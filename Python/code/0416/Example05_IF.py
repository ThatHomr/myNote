# Example05_IF.py

# 정수 하나를 입력을 받고
# 입력받은 정수가 음수인지 0인지 양수인지 출력

n = int(input('Enter an integer >>> '))

if n > 0:
    res = 'positive number'
elif n < 0:
    res = 'negative number'
else : # 0 보다 크지도 않고 작지도 않으면 같은 경우 밖에 없다.
    res = 'zero'

print(f'n is {res}.')
