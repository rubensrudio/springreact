import icon from '../../assets/notification-icon.svg'

import'./styles.css'

function NotificationButton() {
  return (
    <div className="red-btn">
      <img src={icon} alt="Notificar" />
    </div>
  );
}

export default NotificationButton;