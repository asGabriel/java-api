CREATE TABLE Debt (
  id UUID PRIMARY KEY,
  description VARCHAR(255),
  total_value INTEGER NOT NULL,
  paid_value INTEGER DEFAULT 0,
  discount_value INTEGER DEFAULT 0,
  interest_value INTEGER DEFAULT 0,
  fine_value INTEGER DEFAULT 0,
  due_date DATE NOT NULL,
  created_at TIMESTAMP NOT NULL,
  updated_at TIMESTAMP,
  deleted_at TIMESTAMP,
  status VARCHAR(20) CHECK (status IN ('UNPAID', 'PARTIALLY_PAID', 'SETTLED'))
);
