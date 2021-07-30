"""
날짜 : 2021/05/20
이름 : 김철학
내용 : 파이썬 데이터베이스 SQL 실습하기
"""
import pymysql

# 데이터베이스 접속
conn = pymysql.connect(host='192.168.10.114',
                       user='chhak2021',
                       password='1234',
                       db='chhak2021',
                       charset='utf8')

# SQL 실행 객체 생성
cur = conn.cursor()

# SQL 실행
sql = "SELECT * FROM `USER1`;"
cur.execute(sql)
#conn.commit()

# 결과출력
for row in cur.fetchall():
    print('----------------')
    print('아이디 :', row[0])
    print('이름 :', row[1])
    print('휴대폰 :', row[2])
    print('나이 :', row[3])
    print('----------------')

# 데이터베이스 종료
conn.close()

print('Select 완료...')

