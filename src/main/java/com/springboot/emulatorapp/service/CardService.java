package com.springboot.emulatorapp.service;
import java.util.List;

import com.springboot.emulatorapp.model.Card;

public interface CardService {

    /**
     * Создает новую карту
     * @param card карта для создания
     */
    void create(Card card);
 
    /**
     * Возвращает список всех имеющихся карт
     * @return список карт
     */
    List<Card> readAll();
 
    /**
     * Возвращает карту по её ID
     * @param id - ID карты
     * @return - объект карты с заданным ID
     */
    Card read(int id);
 
    /**
     * Обновляет карту с заданным ID,
     * в соответствии с переданным
     * @param card - картой в соответсвии с которой нужно обновить данные
     * @param id - id ккарты которую нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Card card, int id);
 
    /**
     * Удаляет карту с заданным ID
     * @param id - id карты, которую нужно удалить
     * @return - true если карта была удалена, иначе false
     */
    boolean delete(int id);
 }