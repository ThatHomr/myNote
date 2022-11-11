# Example06_IF.py

# 입력받은 정수하나가
# 짝수인지 홀수인지 0인지 출력

n  = int(input('Enter an integer >>> '))

if n % 2 == 0:
    res = 'even number'
elif n % 2 != 0:
    res = 'odd number'
elif n == 0:
    res = 'zero'
print(f'n is {res}.')
# 위와 같이 작성한 경우
# 0인 경우가 수행되지 않는다
#  → 0인 경우가 짝수인 경우에도 포함되기 때문에
#    0인지 검사하기 전에 이미 수행된다.
# 이를 해결하기 위한 방법
#  1. 조건식의 순서를 수정
#  2. 중첩 조건문의 형태로 수정

# 1. 조건식의 순서를 수정
if n == 0:
    res = 'zero'
elif n % 2 == 0:
    res = 'even number'
elif n % 2 != 0:
    res = 'odd number'
print(f'n is {res}.')

# 2. 중첩 조건문의 형태
#     - 조건문의 블록 내에 또다른 조건문을 작성한 형태
if n % 2 == 0: # → 조건 A
    if n == 0 : #  → 조건 B 
        # 조건 A 와 조건 B가 True 이면 수행
        res = 'zero'
    else :
        # 조건 A 가 True 이고, 조건 B 가 False 이면 수행
        res = 'even number'
elif n % 2 != 0:
    res = 'odd number'

print(f'n is {res}.')