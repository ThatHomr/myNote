# Example01_Loop.py
import turtle

# 3 이상의 정수 n 을 입력을 받아서
# 한 변의 길이가 150인 n 각형을 만들자!

#-----------------------------
turtle.shape('turtle')     # 모양
turtle.bgcolor('#333')    # 배경색
turtle.pencolor('white')  # 선 색
turtle.speed(1)           # 속도
turtle.pensize(10)        # 선 두께
#-----------------------------

# 프로그램에서 오류(예외)가 발생 가능성이 있는 코드들은
# 예외 처리를 통해서 예외가 발생했을 때를 대처하기 위한 처리 방식을 지정

while True :
    try :
        # 모서리의 수를 입력
        edge = int(input('Enter the number of edge >>> '))

        # 강제로 예외를 발생시키기 
        if(edge < 3) : raise Exception()

        length = 150
        # angle = 180 - ((edge - 2) * 180)/edge
        angle = 360 / edge # 0 인 경우 예외가 발생
        
        break # 반복문 종료
    except :
        print('Shape that cannot be drawn.')   

# n 각형을 edge 의 수만큼 모서리를 가지기 때문에
# n 번 이동을 하면 된다.
if edge >= 3 :
    for i in range(edge) :
        turtle.forward(length)
        turtle.left(angle)
else :
    print('Shape that cannot be drawn.')   
    
input("Press any key to exit...")