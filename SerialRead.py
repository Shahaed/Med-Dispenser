import serial

users = ['5F 98 3F 28\r\n', '01 02 03 04\r\n']
SundayUserOne = [2,0,1]
SundayUserTwo = [0,3,2]
ser=serial.Serial('/dev/ttyACM0',9600)

read = ser.readline()
if read in users:
    if read == users[0]:
        for x in SundayUserOne:
            ser.write(x)
    else:
        for x in SundayUserTwo:
            ser.write(x)
            
            

            
        
        


