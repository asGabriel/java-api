CREATE TABLE Debt (
  id UUID PRIMARY KEY,
  description VARCHAR(255),
  total_value INTEGER NOT NULL,
  paid_value INTEGER DEFAULT 0,
  discount_value INTEGER DEFAULT 0,
  interest_value INTEGER DEFAULT 0,
  fine INTEGER DEFAULT 0,
  due_date DATE NOT NULL,
  created_at TIMESTAMP NOT NULL,
  updated_at TIMESTAMP,
  deleted_at TIMESTAMP,
  debt_status VARCHAR(20) CHECK (debt_status IN ('UNPAID', 'PARTIALLY_PAID', 'SETTLED'))
);
