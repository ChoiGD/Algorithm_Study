function solution(code) {
    var answer = '';
    let mode = true;
    let ret = "";
    
    for(let i=0; i<code.length; i++){
        
        if(code[i] =='1')
            mode = !mode;
        switch(mode)
        {
            case true:
                if(i%2 == 0)
                {
                    if(code[i] != '1')
                        answer+= code[i];
                }
                break;
            case false:
                if(i%2 != 0)
                {
                    if(code[i] != '1')
                        answer+= code[i];
                }
                break;
        }
    }
     if(answer==="")
        answer = "EMPTY";
    return answer;
}