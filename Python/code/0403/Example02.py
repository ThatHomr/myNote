# Example02.py

time = '14:11:5'
# 5분 30초 뒤의 시간을 출력
#  → '14시 36분 32초'

hour = int( time[0 : 2] )
minute = int( time[3 : 5] ) + 5
second =  int( time[6 : 8] ) + 30

print(f'{hour}시 {minute}분 {second}초')
