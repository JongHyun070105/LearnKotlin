// 코틀린에선 `null` 값을 가질 수 있다. 코틀린에서 `null`은 무언가가 누락되었거나,
// 아직 설정되지 않은 경우 `null` 값을 사용한다.
// null 프로그램에서 값과 관련된 문제를 방지하기 위해 코틀린은 `null Safety`를 제공한다.
// `null Safety`는 null 런타임이 아닌 컴파일 타임에 값과 관련된 문제를 감지한다.
//
// Null Safety는 4가지 기능을 결합한 것이다.
//
// - null 프로그램에서 값이 허용되는 경우를 명시적으로 선언한다.
// - null 값을 확인한다.
// - null 값이 포함될 수 있는 속성이나 함수에 안전한 호출을 사용한다.
// - null 값이 감지되면 수행할 작업을 선언한다.