package com.gdufe.iterator_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/8/1 23:07
 */
public class NewCollection implements MyCollection {

    private Object[] obj = {"dog", "pig", "cat", "monkey"};

    @Override
    public MyIterator createMyIterator() {
        return new NewMyIterator();
    }

    public class NewMyIterator implements MyIterator{
        private int index = 0;
        @Override
        public void first() {
            index = 0;
        }

        @Override
        public void next() {
            if(index < obj.length) {
                index++;
            }
        }

        @Override
        public boolean hasNext() {
            return index < obj.length;
        }

        @Override
        public Object currentItem() {
            return obj[index];
        }
    }
}
