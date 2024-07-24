$(document).ready(function() {
    $('#search-bar').keypress(function(event) {
        if (event.which === 13) { // Enter key pressed
            var query = $(this).val();
            performSearch(query);
        }
    });

    function performSearch(query) {
        console.log('Searching for:', query);
        // 검색 기능 구현
    }
});