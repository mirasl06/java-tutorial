package market.services;

import market.models.User;

/**
 * Abstraktsiyani boshqacha usuli
 * Interface ham klass hisoblanadi
 * Interface da faqat metodlar yoziladi (body qismisiz)
 * Interface ni ishlarish uchun implements qilish kerak
 * Interface ni Abstract klassdan ustun tomoni, bitta klassda bir qancha interfeyslarni chaqirish, ishlatish mumkin
 */
public interface UserService {
    User createUser();

    void deleteUser();

    void updateUser();
}
