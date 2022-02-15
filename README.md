# 맘스잇(Mom's Eat) 
안드로이드 스튜디오를 사용한 임산부 음식 관련 애플리케이션 <br/>
구글 플레이 스토어에서 만나보실 수 있습니다! <br/>
https://play.google.com/store/apps/details?id=com.marline2.moms_eat

시연 영상 : https://youtu.be/6-o3TOynZII <br/>
SearchView와 ListView를 사용하여 음식을 검색창에 검색하면, 해당 낱말에 해당되는 음식을 보여줍니다. 

### 애플리케이션 개발 환경
- Android Studio @2020.03.01 Patch 4

### 애플리케이션 버전
- minSdkVersion 27
- targetSdkVersion 32

### 애플리케이션 주요 코드
- SearchView와 ListView를 사용하여 만든 검색 기능
- overridePendingTransition을 사용하여 만든 화면 전환 슬라이딩(애니메이션)

#### 구성 페이지
메인 화면을 구성하는 MainActivity.java와 activity_main.xml이 있습니다. <br/>
FoodData.java와 MyAdapter.java 그리고 list_page.xml로 검색 기능을 MainActivity.java에 구현했습니다.

그 밖에, 메뉴를 구성하는 SubActivity.java와 subactivity_main.xml이 있습니다. <br/>
각 메뉴의 상세 페이지를 구성하는 xml과 java파일도 존재합니다.

#### 애플리케이션 주요 글꼴
https://font.elice.io/ <br/>
앨리스 디지털 배움체

#### 발전할 점
1. SQLite를 사용했다면 애플리케이션의 전체적인 용량을 축소할 수 있습니다.
2. 레이아웃을 더 체계적으로 만들었으면 유지 보수가 훨씬 간편할 것입니다. Linearlayout을 많이 활용하지 못한 것이 아쉽습니다.

