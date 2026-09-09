// 공통 알림창 열기
function showAlert(message, callback) {
    $('#alert_msg').text(message);
    $('#common_alert').css('display', 'flex'); //

    // 확인 버튼 클릭 시 실행할 콜백 함수 저장
    window.modalCallback = callback;
}

// 공통 알림창 닫기
function closeAlert() {
    $('#common_alert').hide();

    if (typeof window.modalCallback === 'function') {
        window.modalCallback();
        window.modalCallback = null; // 콜백 실행 후 초기화
    }
}