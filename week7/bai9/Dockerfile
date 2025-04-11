# Sử dụng image Python
FROM python:3.10-slim

# Thiết lập thư mục làm việc
WORKDIR /app

# Sao chép requirements và cài đặt
COPY app/requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Sao chép mã nguồn
COPY app .

# Chạy ứng dụng
CMD ["python", "app.py"]
