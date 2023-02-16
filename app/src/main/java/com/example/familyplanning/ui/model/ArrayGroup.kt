package com.example.familyplanning.ui.model

import com.example.familyplanning.R

class ArrayGroup {
    var text=ArrayList<DataModel>()
    var vedio=ArrayList<DataModel2>()
    fun setText(){
        text.add(DataModel("هل تنظيم الأسرة مهم؟"))
        text.add(DataModel("ما هي وسائل تنظيم الأسرة المتاحة؟"))
        text.add(DataModel("كيف أختار الوسيلة المناسبة؟"))
        text.add(DataModel("ما هي أضرار وسائل تنظيم الأسرة؟"))
        text.add(DataModel("هل تنظيم الأسرة غير شرعي أو غير قانوني؟"))
        text.add(DataModel("متي أمتنع عن تنظيم الأسرة؟"))
        text.add(DataModel("ماذا يجب أن أفعل بعد تنظيم الأسرة؟"))
        text.add(DataModel("ما هي أقرب الاماكن المتاحة لتنظيم الاسرة؟"))
    }
    fun setvedio()
    {
        vedio.add(DataModel2("أهمية تنظيم الأسرة",R.drawable.p5))
        vedio.add(DataModel2("أهمية تنظيم الأسرة",R.drawable.p5))
        vedio.add(DataModel2("أهمية تنظيم الأسرة",R.drawable.p5))
        vedio.add(DataModel2("أهمية تنظيم الأسرة",R.drawable.p5))
        vedio.add(DataModel2("أهمية تنظيم الأسرة",R.drawable.p5))
        vedio.add(DataModel2("أهمية تنظيم الأسرة",R.drawable.p5))
        vedio.add(DataModel2("أهمية تنظيم الأسرة",R.drawable.p5))
        vedio.add(DataModel2("أهمية تنظيم الأسرة",R.drawable.p5))
        vedio.add(DataModel2("أهمية تنظيم الأسرة",R.drawable.p5))
        vedio.add(DataModel2("أهمية تنظيم الأسرة",R.drawable.p5))
    }
}