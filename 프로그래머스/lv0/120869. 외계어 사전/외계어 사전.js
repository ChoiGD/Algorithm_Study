function solution(spell, dic) {
    const isSameExist = dic.filter(str=>str.length === spell.length).some((str)=>{
        const isSame = spell.every(s=>{
            return str.includes(s)
        })
        return isSame
    })

    return isSameExist ? 1 : 2
}