/* Name: MedDispenser -- arduino side
 * Programmer: Shahaed Hasan
 * Discription: This program reads an NFC card and uses the unique ID 
 * to identify the user. The program verifies if the user is authorized 
 * and send the user data via serial to an IoT device. Currently the only 
 * network connected device is a photon using 3.3V logic & since we don't 
 * have a logic convertor, we will assume three users, and send a simple 
 * digital signal (ON or OFF) to the photon via D2, D3, D4 
 */

#include <SPI.h>
#include <PN532_SPI.h>
#include <PN532.h>
#include <NfcAdapter.h>

PN532_SPI pn532spi(SPI, 10); //SS
NfcAdapter nfc = NfcAdapter(pn532spi);


#define GateI 2
#define GateII 3
#define GateIII 4
String incomingByte;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(GateI, OUTPUT);
  pinMode(GateII, OUTPUT);
  pinMode(GateIII, OUTPUT);
  pinMode(LED_BUILTIN, OUTPUT);
  //nfc.begin();
}

void loop() {
  if (nfc.tagPresent()){
    NfcTag tag = nfc.read();
    Serial.println(tag.getUidString());
    
  }
  if (Serial.available() > 0){
    incomingByte = Serial.readString();

    Serial.print("I received: ");
    Serial.println(incomingByte);
    
    if (incomingByte == "1"){
      openA();
    }
    else if (incomingByte == "2"){
      openB();
    }
    else if (incomingByte == "3"){
      openC();
    }
  }
  delay(750);
}

void openA(){
  digitalWrite(LED_BUILTIN, HIGH);   // turn the LED on (HIGH is the voltage level)
  delay(1000);       
  Serial.print("A open");
  // wait for a second
  digitalWrite(LED_BUILTIN, LOW);    // turn the LED off by making the voltage LOW
  delay(1000);  
}

void openB(){
  digitalWrite(LED_BUILTIN, HIGH);   // turn the LED on (HIGH is the voltage level)
  delay(1000);                       // wait for a second
  digitalWrite(LED_BUILTIN, LOW);    // turn the LED off by making the voltage LOW
  delay(1000);  
}

void openC(){
  digitalWrite(LED_BUILTIN, HIGH);   // turn the LED on (HIGH is the voltage level)
  delay(1000);                       // wait for a second
  digitalWrite(LED_BUILTIN, LOW);    // turn the LED off by making the voltage LOW
  delay(1000);  
}



