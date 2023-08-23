function solution(letter) {
 
    let moss=[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
    let strE=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
    
    let letterA=letter.split(' ').map((v)=>{
        return moss.indexOf(v)
    })
     
    let letterB=letterA.map((v)=>{
        return strE[v]
    })
    
    return letterB.join('');
}