# File01_Operator.py

# 비교 연산자

# n1의 값이 짝수인지 검사하여 출력
#  짝수이면 True, 아니면 False
# 짝수 = 2의 배수 = 2로 나눴을 때 나머지가 0인 수
n1 = 150
is_even = n1 % 2 == 0
print(f'{n1} is even : {is_even}')
print('--------------------------')
# s1, s2, s3 의 평균이 75가 넘으면 True
# 아니면 False 가 출력되도록 작성
s1, s2, s3 = 70, 88, 89
# 평균(average)
#  s1~s3 의 합에서 해당 수만큼 나눈 값
avg = (s1 + s2 + s3) / 3
res = avg > 75
print(f'{avg:.5} > 75 => {res}')
print('--------------------------')

# 논리 연산자

# n1, n2 의 값이 3의 배수인지 검사하여 출력
#  n1, n2 모두 3의 배수이면 True, 아니면 False 를 출력
n1, n2 = 12, 153
res1 = n1 % 3 == 0
res2 = n2 % 3 == 0
res = res1 and res2
# res = (n1 % 3 == 0) and (n2 % 3 == 0)
print(f'n1 is multiple of 3 >>> {res1}')
print(f'n2 is multiple of 3 >>> {res2}')
print(f'n1 and n2 are multiple of 3 >>> {res}')
print('--------------------------')
# n1 의 값이 100 이상 300 미만의 수 이거나 11의 배수이면 True
# 아니면 False 가 출력되도록 작성
n1 = 500

res1 = 100 <= n1 < 300
res2 = n1 % 11 == 0
# a 이거나 b = a 또는 b
res = res1 or res2
print(f'100 <= n1 < 300 → {res1}')
print(f'n1 is multiple of 11 → {res2}')
print(f'>>> {res}')
print('--------------------------')

# 조건 연산자
a = 5

# a가 10보다 크다.
is_bigger = a > 10
print(f'a가 10보다 크다. {is_bigger}')

# a가 10보다 크면 '크다' 를 출력하고
# 그렇지 않으면 '크지 않다' 를 출력
res = '크다.' if a > 10 else '크지 않다.'
print(f'a가 10보다 {res}')
print('--------------------------')
# s1, s2, s3 의 평균이 80 이상이면 '합격'을 출력하고
# 그렇지 않으면 '불합격'을 출력하도록 작성
s1, s2, s3 = 80, 81, 33
avg = (s1 + s2 + s3) / 3

res = '합격' if avg >= 80 else '불합격'
print(f'평균 : {avg:.2f} → {res}')
print('-'*30)




















