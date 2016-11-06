import serial

users = ['5F 98 3F 28\r\n', '01 02 03 04\r\n']
ser=serial.Serial('/dev/ttyACM0',9600)

read = ser.readline()
if read in users:
    if read == users[0]:
        


