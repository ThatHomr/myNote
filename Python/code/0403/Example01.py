# 이름 나이를 출력
my_infor = '홍길동/27'

name = my_infor[0] + my_infor[1] + my_infor[2]
age = my_infor[4] + my_infor[5]
print('이름 : ' + name)
print('나이 : ' + age)
print('십년 뒤의 나이 :', int(age) + 10)
#-------------------------------
ymd = '2022/04/03'
year = ymd[0] + ymd[1] + ymd[2] + ymd[3]
month = ymd[5] + ymd[6]
day = ymd[8] + ymd[9]
print(year + '년 '  + month + '월 ' + day + '일 ')

year = ymd[ : 4]
month = ymd[5 : 7]
day = ymd[8 : ]
print(year + '년 '  + month + '월 ' + day + '일 ')







