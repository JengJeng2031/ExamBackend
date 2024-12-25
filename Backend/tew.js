function score(aliceArray,bobArray){
    let aliceScore = 0;
    let bobScore = 0;
    for (let i = 0;i<aliceArray.length; i++){
        if (aliceArray[i]>bobArray[i]){
            aliceScore +=1;
        }else if (bobArray[i] > aliceArray[i]) {
            bobScore+=1;
        }
    }

    return [aliceScore,bobScore];
}

const bob = [1,2,3];
const alice = [7,1,3];
console.log(score(alice,bob));