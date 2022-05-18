package com.example.vazifa_2.service;

import com.example.vazifa_2.DTO.AnswerDto;
import com.example.vazifa_2.Repository.AnswerRepos;
import com.example.vazifa_2.entity.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;
import java.util.Optional;
@Service
public class LanguageService {
    @Autowired
    AnswerRepos answerRepos;

    public String insert1(AnswerDto dto){
        if(true)
            return "Bunday address mavjud emas";
        if(true)
            return "Bunady address mavjud";
        Answer address=new Answer();
        address.setUser(address.getUser());
        answerRepos.save(address);
        return "Muavfaqiyatli joylandi";
    }

    public List<Answer> select(Integer id){
        Optional<Answer> optional=answerRepos.findById(id);
        if(optional.isPresent()){
            return answerRepos.findAllByFirmaId(id);
        }
        return null;
    }

    public String update(AnswerDto dto, Integer id){
        Optional<Answer> optional=answerRepos.findById(id);
        if(!optional.isPresent())
            return "Bunday answer yo'q";
        Optional<Answer> optional1=answerRepos.findById(id);
        if(!optional1.isPresent())
            return "Bunday answer mavjud emas";
        if(true)
            return "Bunady answer mavjud";
        Answer address=optional.get();
        address.setUser(address.getUser());
        address.setText(address.getText());
        answerRepos.save(address);
        return "Muavfaqiyatli yangilandi";
    }

    public boolean delete(Integer id){
        Optional<Answer> optional=answerRepos.findById(id);
        if(!optional.isPresent())
            return false;
        answerRepos.deleteById(id);
        return true;
    }
}
