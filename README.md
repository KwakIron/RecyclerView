# RecyclerView
```
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Holder> {
    List<Data> datas;
    Context context;
    public RecyclerAdapter(Context context, List<Data> datas){
        this.datas = datas;
        this.context = context;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Data data =datas.get(position);
        holder.imageView.setImageResource(data.imageId);
        holder.textView.setText(data.title);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public Holder(View itemView) {
            super(itemView);
            imageView = (ImageView)itemView.findViewById(R.id.imageView);
            textView = (TextView)itemView.findViewById(R.id.textView);
        }
    }
}
