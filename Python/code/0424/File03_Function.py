# File03_Function.py

# 함수(Function)
#  - 특정 목정의 기능을 수행하기 위한 코드들의 집합
#  - 매개변수와 반환값은 없는 경우도 있다.

# 두 정수의 합을 반환하는 함수
def add(x, y) :
    res = x + y
    return res
    # return : '되돌아간다.' = 함수 종료
    
print(f'add(10, 60) = {add(10, 60)}')