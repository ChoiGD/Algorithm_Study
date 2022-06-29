package org.choigd.study1;

/*
FrequencyCounter (빈도수 세기)
두개의 배열이나 문자열을 비교할때 사용하는 패턴

객체 배열을 사용하여 비교하면 비교적 쉽게 처리할 수 있다.

<<<<<<< HEAD
//JS Code
=======

JS Code

>>>>>>> 953cab550b787a4f071ddec3e2e6362c0dff9be1
function validAnagram(str1,str2){
  // add whatever parameters you deem necessary - good luck!
  // st1, str2의 길이가 다를 경우 리턴
  if(str1.lenght !== str2.lenght){
      return
  }
  const gram1 = {}
  const gram2 = {}

  for(let val of str1){
      gram1[val] = (gram1[val] || 0) + 1
  }
  for(let val of str2){
      gram2[val] = (gram2[val] || 0) + 1
  }
  for(let key in gram1){
      if(gram1[key] !== gram2[key]){
          return false
      }
  }
  return true


}
 */


import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {

        Boolean res = true;

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        char[] strArr1 = str1.toCharArray();
        String str2 = sc.next();
        char[] strArr2 = str2.toCharArray();

        //str1, str2의 길이가 다를 경우 false
        if(strArr1.length != strArr2.length){
            res = false;
        }



    }
}
