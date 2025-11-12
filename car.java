<script>
      const menuIcon = document.querySelector('.menu-icon');
      const sidebar = document.getElementById('sidebar');
    
      menuIcon.addEventListener('click', () => {
        if (sidebar.style.left === '0px') {
          sidebar.style.left = '-250px';
        } else {
          sidebar.style.left = '0px';
        }
      });
    </script>