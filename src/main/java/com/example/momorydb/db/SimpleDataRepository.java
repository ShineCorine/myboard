package com.example.momorydb.db;
import com.example.momorydb.entity.Entity;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

// 상속을 받을 수도 있고 안 받을 수도 있도록 추상클래스로 만듦
abstract public class SimpleDataRepository<T extends Entity, ID extends Long> implements DataRepository<T, ID> {

    private List<T> dataList = new ArrayList<>();

    private static long index = 0;

    private Comparator<T> sort = new Comparator<T>() {
        @Override
        public int compare(T o1, T o2) {
            return Long.compare(o1.getId(), o2.getId());
        }
    };

    @Override
    public T save(T data) {
        if (Objects.isNull(data)) {
            throw new RuntimeException("Data is null");
        }

        // db에 데이터가 있는지 확인
         var prevData = dataList.stream()
                .filter(it -> {
                    return it.getId().equals(data.getId());
                })
                .findFirst();

        if (prevData.isPresent()) {
            dataList.remove(prevData.get());
            dataList.add(data);
        } else {
            index++;
            data.setId(index);
            dataList.add(data);
        }
        return data;
    }

    @Override
    public Optional<T> findById(ID id){
        return dataList.stream()
                .filter(it -> {
                    return (it.getId().equals(id));
                })
                .findFirst();
    }
    @Override
    public List<T> findAll(){
        return dataList.stream()
                .sorted(sort)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(ID id){
        var deleteEntity = dataList.stream()
                .filter(it -> {
                    return it.getId().equals(id);
                })
                .findFirst();
        if(deleteEntity.isPresent()){
            dataList.remove(deleteEntity.get());
        }
    }
}
