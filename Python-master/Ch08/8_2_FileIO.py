"""
날짜 : 2021/05/03
이름 : 김철학
내용 : 파이썬 파일 입출력 실습 교재 p217
"""

# 파일 읽기(File Input)
file1 = open('C:/Users/bigdata.DESKTOP-61ML0B4/Desktop/Sample.txt', 'r')
line = file1.readline()

print('line :', line)
file1.close()

# 여러줄 파일 읽기
file2 = open('C:/Users/bigdata.DESKTOP-61ML0B4/Desktop/Sample.txt', 'r')

while True:
    line = file2.read()

    if not line:
        # 읽을 라인이 없을 경우
        break

    print(line)

file2.close()

# 파일 쓰기(File Output)
file3 = open('C:/Users/bigdata.DESKTOP-61ML0B4/Desktop/Test.txt', 'w')
file3.write('안녕하세요.\n')
file3.write('반갑습니다.\n')
file3.write('감사합니다.\n')
file3.close()

# 구구단 쓰기
file4 = open('C:/Users/bigdata.DESKTOP-61ML0B4/Desktop/Gugudan.txt', 'w')

for x in range(2, 10):
    file4.write('%d단\n' % x)
    for y in range(1, 10):
        z = x * y
        file4.write('{} x {} = {}\n'.format(x, y, z))

file4.close()








