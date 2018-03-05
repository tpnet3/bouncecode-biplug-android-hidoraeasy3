## 1. 다음 코드를 에디터에 입력해서 필요한 패키지를 추가하세요.
패키지란 관련있는 기능들을 하나로 묶어 놓은 것입니다.

```java
import java.util.Random;
import android.widget.Toast;
```

## 2. 다음 코드를 에디터에 입력해서 변수를 선언하세요.
변수란 데이터를 저장하는 공간으로서 개발자가 이름을 붙일 수 있습니다.

```java
static int lisaNum; // 캐릭터가 생각하는 숫자
static int userNum = -1; // 사용자가 입력한 숫자
```

## 3. 다음 코드를 에디터에 입력해서 캐릭터가 생각하는 숫자를 랜덤한 값으로 채워넣으세요.

```java
// 랜덤한 값을 대입한다.
Random r = new Random();
lisaNum = r.nextInt(51);
```

## 4. 사용자가 입력한 값을 받는 코드를 에디터에 입력하세요.
예외가 생길 수 있는 실행문을 try 블록에 넣고, 예외를 처리하는 문장을 catch 블록에 넣습니다. 이 코드에서는 사용자로부터 받은 입력이 숫자가 아닐 경우 숫자를 입력하라는 팝업창을 뜨게 하였습니다.

```java
if (uiBlock.equals(mButtonBlockUiId1511831288129)) {
    // .getText() 함수를 통해 사용자로부터 입력을 받는다.
    String userValue = mButtonBlockUiId1511831288129.getText).toString();
    
    try {
        // 데이터 타입을 정수인 int형으로 일치시켜준다.
        userNum = Integer.parseInt(userValue);
    } catch(NumberFormatException e) {
        // Toast.makeText() 함수를 통해 숫자가 아닌 입력이 들어왔을 떄 경고 메시지를 출력한다.
        Toast.makeText(getApplicationContext(), "1-50 사이의 숫자만 입력해야해!", Toast.LENGTH_LONG).show();
    }
    
    // 숫자를 비교한다.
    if (userNum == lisaNum) return false;
    // Toast.makeText() 함수를 통해 사용자가 입력한 값이 작으면 더 큰 수를 고르라는 팝업창을 띄운다.
    else if (userNum < lisaNum) Toast.makeText(getApplicationContext(), "더 큰 수를 골라봐", Toast.LENGTH_LONG).show();
    // Toast.makeText() 함수를 통해 사용자가 입력한 값이 크면 더 작은 수를 고르라는 팝업창을 띄운다. 
    else Toast.makeText(getApplicationContext(), "더 작은 수를 골라봐", Toast.LENGTH_LONG).show();
}

return true;
```
